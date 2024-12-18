plugins {
	java
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
	id("com.diffplug.spotless") version "6.21.0"

}

group = "com.ednova"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(23)
	}
}


configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())

	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
spotless {
	java {
		googleJavaFormat("1.17.0")  // Or eclipse() if you're using Eclipse formatter
		trimTrailingWhitespace()
		endWithNewline()
		// Enforce LF line endings
		//lineEndings = 'UNIX'
	}
}


tasks.withType<Test> {
	useJUnitPlatform()
}
val installLocalGitHookTaskName = "installLocalGitHook"
tasks.register<Copy>(installLocalGitHookTaskName) {
	group = "PRE_BUILD_CUSTOM_TASKS"
	description = "Install local git hooks"
	from(".githooks")
	into(".git/hooks")
}

tasks.named("build") {
	dependsOn(installLocalGitHookTaskName)
}

