# Startup Timing

All values in milliseconds.

## macOS

### Cold start

| Build mode | Shell → Main | Main → Window | Total | Speedup (vs. no AOT) |
|---|---:|---:|---:|---------------------:|
| No AOT | 1133 | 884 | 2017 |                    — |
| AppCDS Prebuild | 48 | 478 | 526 |                 3.8× |
| AOT Prebuild | 67 | 357 | 424 |                 4.8× |

### Hot start (2nd run)

| Build mode | Shell → Main | Main → Window | Total | Speedup (vs. no AOT) |
|---|---:|---:|---:|---------------------:|
| No AOT | 76 | 860 | 936 |                    — |
| AppCDS Prebuild | 46 | 488 | 534 |                 1.8× |
| AOT Prebuild | 69 | 368 | 437 |                 2.1× |


## Windows

### Cold start

| Build mode | Shell → Main | Main → Window | Total | Speedup (vs. no AOT) |
|---|---:|---:|---:|---------------------:|
| No AOT | 145 | 1211 | 1356 |                    — |
| AppCDS Prebuild | 110 | 718 | 828 |                 1.6× |
| AppCDS Prebuild (relocated*) | 106 | 1111 | 1217 |                 1.1× |
| AOT Prebuild | 130 | 520 | 650 |                 2.1× |
| AOT Prebuild (relocated*) | 402 | 517 | 919 |                 1.5× |

### Hot start (2nd run)

| Build mode | Shell → Main | Main → Window | Total | Speedup (vs. no AOT) |
|---|---:|---:|---:|---------------------:|
| No AOT | 137 | 1193 | 1330 |                    — |
| AppCDS Prebuild | 113 | 688 | 801 |                 1.7× |
| AppCDS Prebuild (relocated*) | 103 | 1092 | 1195 |                 1.1× |
| AOT Prebuild | 126 | 530 | 656 |                 2.0× |
| AOT Prebuild (relocated*) | 391 | 526 | 917 |                 1.5× |


*Executed in a such a way that the jars at the classpath with which the app was packages don't exist.
This is important due to https://youtrack.jetbrains.com/issue/JBR-9098/AppCDS-writes-local-paths-into-.jsa-archive
 