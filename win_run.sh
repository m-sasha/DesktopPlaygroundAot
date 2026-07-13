#!/bin/sh

shell_time=$(./getms.exe)
cd "build/compose/binaries/main-release/app/DesktopPlayground" || exit
./DesktopPlayground.exe "$shell_time"
