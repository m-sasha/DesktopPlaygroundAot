#!/bin/sh
set -v

# Remember script directory
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

# Build a utility to get current time very quickly
gcc ./getms.c -o ./getms

# Clean
./gradlew --no-daemon clean

# Build the distributable
./gradlew --no-daemon :composeApp:createReleaseDistributable
