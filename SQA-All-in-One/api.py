"""OpenAI-compatible KKU gateway client; Python standard library only."""
import json
import socket
import time
from urllib import error, request
from urllib.parse import urlparse


class APIError(RuntimeError):
    def __init__(self, message, status=None):
        super().__init__(message)
        self.status = status


class NoRedirect(request.HTTPRedirectHandler):
    def redirect_request(self, req, fp, code, msg, headers, newurl):
        return None  # Do not forward a bearer token to a different URL.


class Client:
    def __init__(self, base_url, key, timeout=180, retries=2):
        self.base_url = base_url.rstrip('/')
        parsed = urlparse(self.base_url)
        if parsed.scheme != 'https' and not (parsed.scheme == 'http' and parsed.hostname in ('localhost', '127.0.0.1', '::1')):
            raise APIError('API_BASE_URL must be an HTTPS URL.')
        if not key or key == 'YOUR_KKU_API_KEY':
            raise APIError('ยังไม่มี API key: รัน bash run.sh setup')
        self.key, self.timeout, self.retries = key, timeout, retries
        self.opener = request.build_opener(NoRedirect())

    def _request(self, path, payload=None):
        data = json.dumps(payload).encode() if payload is not None else None
        req = request.Request(self.base_url + path, data=data,
                              headers={'Authorization': 'Bearer ' + self.key,
                                       'Content-Type': 'application/json', 'Accept': 'application/json',
                                       'User-Agent': 'SQA-Closure-API-Ready/1.0'})
        for attempt in range(self.retries + 1):
            try:
                with self.opener.open(req, timeout=self.timeout) as response:
                    body = response.read(8 * 1024 * 1024).decode('utf-8')
                return json.loads(body)
            except error.HTTPError as exc:
                body = exc.read(3000).decode('utf-8', errors='replace').replace(self.key, '[REDACTED]')
                exc.close()
                if exc.code in (429, 500, 502, 503, 504) and attempt < self.retries:
                    wait = min(15, 2 ** (attempt + 1))
                    print('API HTTP %s; retry in %ss' % (exc.code, wait), flush=True)
                    time.sleep(wait)
                    continue
                hint = {401: 'API key ไม่ถูกต้องหรือหมดอายุ', 403: 'key ไม่มีสิทธิ์ใช้งาน',
                        404: 'URL หรือ model ID ไม่ถูกต้อง', 429: 'ถึงโควต้าหรือจำกัดคำขอ; ผลเดิมเก็บไว้แล้ว'}.get(exc.code, 'ตรวจ API URL / สิทธิ์ของโมเดล')
                raise APIError('HTTP %s: %s\n%s' % (exc.code, hint, body), exc.code) from None
            except (error.URLError, socket.timeout, TimeoutError) as exc:
                # Do not retry ambiguous timeouts automatically: the server may
                # already have consumed tokens for a completion.
                raise APIError('เชื่อมต่อ API ไม่สำเร็จ/หมดเวลา: ' + str(exc).replace(self.key, '[REDACTED]')) from None
            except (json.JSONDecodeError, UnicodeDecodeError):
                raise APIError('API returned non-JSON data; check API_BASE_URL.') from None

    def models(self):
        response = self._request('/models')
        if not isinstance(response, dict) or not isinstance(response.get('data'), list):
            raise APIError('/models did not return a data array; check API_BASE_URL.')
        models = list(dict.fromkeys(v['id'] for v in response.get('data', []) if isinstance(v, dict) and isinstance(v.get('id'), str)))
        if not models:
            raise APIError('/models returned no usable model IDs.')
        return models

    def chat(self, model, messages, max_tokens=6000):
        response = self._request('/chat/completions', {'model': model, 'messages': messages, 'max_tokens': max_tokens})
        try:
            choice = response['choices'][0]
            content = choice['message'].get('content')
        except (KeyError, IndexError, TypeError):
            raise APIError('API response has no choices[0].message.content.') from None
        if choice.get('finish_reason') in ('length', 'max_tokens'):
            raise APIError('คำตอบถูกตัดกลางไฟล์: เพิ่ม MAX_OUTPUT_TOKENS ใน .env แล้วใช้ --round 2 หรือรอบใหม่')
        if isinstance(content, list):
            content = '\n'.join(v.get('text', '') for v in content if isinstance(v, dict))
        if not isinstance(content, str) or not content.strip():
            raise APIError('API ส่งข้อความว่าง: ตรวจว่า model ID รองรับ chat/completions')
        return {'text': content, 'tokens': (response.get('usage') or {}).get('total_tokens'), 'response': response}
