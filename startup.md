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