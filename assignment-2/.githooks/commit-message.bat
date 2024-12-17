@echo off
setlocal enabledelayedexpansion

REM Récupère le message du commit
set commit_message_file=%1
set commit_message=
for /f "tokens=* delims=" %%a in (%commit_message_file%) do (
    set commit_message=%%a
    goto :check_message
)

:check_message
REM Vérifie si le message commence par "ednova-assignement-2"
echo "!commit_message!" | findstr /b "ednova-assignement-2" >nul
if errorlevel 1 (
    echo ERROR: Le message de commit doit commencer par "ednova-assignement-2"
    exit /b 1
)

exit /b 0
