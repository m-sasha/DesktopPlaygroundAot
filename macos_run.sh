#!/bin/sh

shell_time=$(./getms)
pushd .
cd "build/compose/binaries/main-release/app/DesktopPlayground.app" || exit
./Contents/MacOS/DesktopPlayground "$shell_time"
popd