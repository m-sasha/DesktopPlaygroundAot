# Test project for CMP-Desktop packaging with AppCDS/AOT

## Project structure:

- `win/macos_prepare.sh`: Script that builds the app
- `win/macos_run.sh`: Script that runs the app

## Preparation

1. Check out the compose-multiplatform project on the m-sasha/aot branch
2. Edit the `includeBuild` in settings.gradle.kts (of *this* project) to point to the correct location of the
   compose-multiplatform project.
3. If you don't have Java on your PATH, either set it directly, or edit the `_prepare.sh` file and set it there
4. Set the desired mode in the `aot` section of the `build.gradle.kts` file.
5. Run the `_prepare.sh` script
6. Run the `_run.sh` script
7. Repeat as necessary