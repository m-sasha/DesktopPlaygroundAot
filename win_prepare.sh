#!/bin/sh

# Remember script directory
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

export JAVA_HOME="C:\Users\msash\.jdks\jbr-21.0.11"

# Build a utility to get current time very quickly
gcc ./getms.c -o ./getms

# Clean
./gradlew.bat --no-daemon clean

# Build the distributable
./gradlew.bat --no-daemon createReleaseDistributable
