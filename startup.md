# macOS

## No AOT

### Cold
From shell execution to main start: 1133ms
From main start to window open: 884ms
Total: 2017ms

### Hot (2nd run)
From shell execution to main start: 76ms
From main start to window open: 860ms
Total: 936ms


## AppCdsPrebuild

### Cold
From shell execution to main start: 48ms
From main start to window open: 478ms
Total: 526ms

### Hot (2nd run)
From shell execution to main start: 46ms
From main start to window open: 488ms
Total: 534ms


## AotPrebuild

### Cold
From shell execution to main start: 67ms
From main start to window open: 357ms
Total: 424ms

### Hot (2nd run)
From shell execution to main start: 69ms
From main start to window open: 368ms
Total: 437ms


# Windows

## No AOT

### Cold
From shell execution to main start: 145ms
From main start to window open: 1211ms
Total: 1356ms

### Hot (2nd run)
From shell execution to main start: 137ms
From main start to window open: 1193ms
Total: 1330ms


## AppCdsPrebuild

### Cold
From shell execution to main start: 110ms
From main start to window open: 718ms
Total: 828ms

### Hot (2nd run)
From shell execution to main start: 113ms
From main start to window open: 688ms
Total: 801ms

### Cold relocated
From shell execution to main start: 106ms
From main start to window open: 1111ms
Total: 1217ms

### Hot (2nd run) relocated
From shell execution to main start: 103ms
From main start to window open: 1092ms
Total: 1195ms


## AotPrebuild

### Cold
From shell execution to main start: 130ms
From main start to window open: 520ms
Total: 650ms

### Hot (2nd run)
From shell execution to main start: 126ms
From main start to window open: 530ms
Total: 656ms

### Cold relocated
From shell execution to main start: 402ms
From main start to window open: 517ms
Total: 919ms

### Hot (2nd run) relocated 
From shell execution to main start: 391ms
From main start to window open: 526ms
Total: 917ms
