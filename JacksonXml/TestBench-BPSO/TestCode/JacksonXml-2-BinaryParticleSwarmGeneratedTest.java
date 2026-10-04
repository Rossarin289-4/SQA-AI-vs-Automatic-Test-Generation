package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", ""}}, 1), new String[][]{{"getColumnNr", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", ".1.5"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#223#1404026400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "TITLE1.5d1"}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"TTLEa"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"[11,2]"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "1e10(Token stream:"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"2020-02-30T2:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getDepth", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"E"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{" repeat?=\n"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "truue3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "123456789012345678901234567890Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}});
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getNamespaceURI", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"--"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"1,2]"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}), new String[][]{{"getNamespaceCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "21147483648"}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getCharOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getSourceRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}), new String[][]{{"getByteOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}), new String[][]{{"getColumnNr", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getByteOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 1), new String[][]{{"getSourceRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"2020-01-01)"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", " "}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3), new String[][]{{"getCharOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.io.IOException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}), new String[][]{{"getColumnNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", ""}}), new String[][]{{"getElementAsQName", "", "7"}});
  assertNotNull(actual);
  assertEquals("javax.xml.namespace.QName", actual.getClass().getName());
  assertEquals("{sample}sample {getLocalPart=sample, getNamespaceURI=sample, getPrefix=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getNamespacePrefix", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 3), new String[][]{{"getColumnNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}), new String[][]{{"getDepth", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{".--1"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", " repeat?\ntrue"}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "1.1234567] repeatElement="}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=0 attr#=0 nextAttr#=0 name=null text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=0, getLocalName=null, getNamespaceURI=null, getText=null, hasAtt...#214#-460976999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}}, 2), new String[][]{{"getCharOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getSourceRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getCharOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "(.4e300"}}, 2), new String[][]{{"getColumnNr", "", "3"}, {"getByteOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}), new String[][]{{"getElementAsInteger", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.codehaus.stax2.typed.TypedXMLStreamException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}), new String[][]{{"getEndingByteOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3), new String[][]{{"getCharOffset", "", "7"}, {"getLineNr", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 2), new String[][]{{"getCharOffset", "", "0"}, {"getCharOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 1), new String[][]{{"getSourceRef", "", "0"}, {"getCharOffset", "", "4"}, {"getLineNr", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1), new String[][]{{"getElementAsFloat", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.codehaus.stax2.typed.TypedXMLStreamException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "{\"a\":1}a,b,c"}}, 2), new String[][]{{"getAttributeAsFloat", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.codehaus.stax2.typed.TypedXMLStreamException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3), new String[][]{{"getByteOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getCharOffset", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 1), new String[][]{{"getCharOffset", "", "1"}, {"getByteOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 1), new String[][]{{"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("javax.xml.namespace.QName", actual.getClass().getName());
  assertEquals(" {getLocalPart=, getNamespaceURI=, getPrefix=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", " "}}, 2), new String[][]{{"getEncoding", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"1.4"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"2"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "{\"a\":1}"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 3), new String[][]{{"getSourceRef", "", "7"}, {"getSourceRef", "", "1"}, {"getSourceRef", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getAttributeAsFloat", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.codehaus.stax2.typed.TypedXMLStreamException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", ""}}, 1), new String[][]{{"getByteOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getByteOffset", "", "5"}, {"getLineNr", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", new String[]{"java.lang.String"}, new String[]{"2Title"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=4 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=4, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-277732407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", ""}}, 2), new String[][]{{"getSourceRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_allWs", "java.lang.String", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"getElementText", "", "3"}, {"getElementAsBinary", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 2), new String[][]{{"getSourceRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "convertToString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}), new String[][]{{"getColumnNr", "", "6"}, {"getByteOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}), new String[][]{{"getSourceRef", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamesp...#251#-1974054095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}}, 2), new String[][]{{"getSourceRef", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getLocalName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "next", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=0 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#-848540504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "hasAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[Wrapper: empty] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getT...#229#-1297585607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=-1, getCharOffset=1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_handleRepeatElement", ""}}, 2), new String[][]{{"getColumnNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getXmlReader", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2ReaderAdapter", actual.getClass().getName());
  assertEquals("{getAttributeCount=1, getCharacterEncodingScheme=sample, getDTDInternalSubset=null, getDTDPublicId=null, getDTDRootName=null, getDTDSystemId=null, getDepth=0, getElementAsBinary=!IllegalStateException...#536#-1953599229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getColumnNr", "", "0"}, {"getByteOffset", "", "6"}, {"getByteOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "closeCompletely", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipAttributes", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "close", ""}}, 3), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespaceURI=sample, getText=null, ...#219#-1271321050", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "skipEndElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getNamespaceURI", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=3 attr#=1 nextAttr#=0 name=sample text=sample repeat?=0 wrapper=[null] repeatElement=0 nextName=null) {getCurrentToken=3, getLocalName=sample, getNamespaceURI=sample, getText=samp...#224#1299294889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "repeatStartElement", ""}}, 3), new String[][]{{"getColumnNr", "", "2"}, {"getByteOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Token stream: state=1 attr#=1 nextAttr#=0 name=sample text=null repeat?=1 wrapper=[Wrapper: ROOT, matching: sample] repeatElement=1 nextName=null) {getCurrentToken=1, getLocalName=sample, getNamespac...#246#-797915847", SearchInputFactory_scaffolding.receiverState());
 }
}
