@echo off
setlocal enabledelayedexpansion

set commit_message_file=%1
set commit_message=
for /f "tokens=* delims=" %%a in (%commit_message_file%) do set commit_message=%%a

echo !commit_message! | findstr /b "ednova-assignement-2" >nul
if errorlevel 1 (
    echo ERROR: Commit message must start with "ednova-assignement-2"
    exit /b 1
)
