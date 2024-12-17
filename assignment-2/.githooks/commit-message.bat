@echo off
setlocal enabledelayedexpansion

REM Path to the commit message file
set commit_message_file=%1

REM Read the first line of the commit message
set commit_message=
for /f "usebackq tokens=* delims=" %%a in (%commit_message_file%) do (
    set commit_message=%%a
    goto :check_message
)

:check_message
REM Check if the commit message starts with "ednova-assignement-2"
echo "!commit_message!" | findstr /b "ednova-assignement-2" >nul
if errorlevel 1 (
    echo ERROR: Commit message must start with "ednova-assignement-2"
    exit /b 1
)

REM Commit message is valid
exit /b 0
