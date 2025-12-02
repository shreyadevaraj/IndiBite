@echo off
echo Starting IndiBite Application...
echo.

REM Check if Maven is installed
where mvn >nul 2>nul
if %ERRORLEVEL% EQU 0 (
    echo Maven found. Building and running the application...
    mvn clean spring-boot:run
) else (
    echo Maven not found in PATH.
    echo.
    echo Please install Maven or run the application from your IDE.
    echo.
    echo Alternative: If you have Maven installed, add it to your PATH.
    pause
)
