import com.github.c64lib.retroassembler.domain.AssemblerType

plugins {
    id("com.github.c64lib.retro-assembler") version "1.5.1"
}

repositories {
     mavenCentral()
}

retroProject {
    dialect = AssemblerType.KickAssembler
    dialectVersion = "5.23"
    libDirs = arrayOf(".ra/deps/c64lib", ".ra/deps/c64lib")
    srcDirs = arrayOf("src")
    excludes = arrayOf("**/_*.asm")

    libFromGitHub("c64lib/common", "0.3.0")
    libFromGitHub("c64lib/chipset", "0.3.0")
    libFromGitHub("c64lib/text", "0.3.0")
    libFromGitHub("c64lib/copper64", "0.3.0")
    libFromGitHub("c64lib/64spec", "0.7.0pr")
}
