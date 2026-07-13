#!/bin/sh

# Remember script directory
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

#export JAVA_HOME=/Users/sasha/Library/Java/JavaVirtualMachines/corretto-21.0.9/Contents/Home

# Build a utility to get current time very quickly
gcc ./getms.c -o ./getms

# Clean
./gradlew --no-daemon clean

# Build the distributable
./gradlew --no-daemon createReleaseDistributable
