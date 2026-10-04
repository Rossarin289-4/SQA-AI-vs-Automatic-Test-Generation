FROM maven:3.9-eclipse-temurin-11

ENV MAVEN_OPTS="-Xmx2g"
WORKDIR /workspace

# Defects4J 3 is required by the paired buggy/fixed test runner.
RUN apt-get update && apt-get install -y --no-install-recommends \
    git subversion perl cpanminus build-essential curl unzip wget \
    && rm -rf /var/lib/apt/lists/*
RUN git clone --depth 1 --branch v3.0.1 https://github.com/rjust/defects4j.git /opt/defects4j \
    && cd /opt/defects4j \
    && cpanm --notest --installdeps . \
    && ./init.sh
RUN apt-get update && apt-get install -y --no-install-recommends bc \
    && rm -rf /var/lib/apt/lists/*
ENV D4J_HOME=/opt/defects4j
ENV PATH="/opt/defects4j/framework/bin:${PATH}"

# Warm Maven dependencies; source files are mounted from the project directory at runtime.
COPY pom.xml /tmp/project/pom.xml
RUN mvn -f /tmp/project/pom.xml -q dependency:go-offline

# python3 for scripts/export_team_layout.py (the "export to repository layout" button); last so the layers above stay cached.
RUN apt-get update && apt-get install -y --no-install-recommends python3 \
    && rm -rf /var/lib/apt/lists/*

EXPOSE 8080
CMD ["mvn", "-B", "spring-boot:run"]
