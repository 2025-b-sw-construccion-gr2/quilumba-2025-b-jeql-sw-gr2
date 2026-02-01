@echo off
echo Organizando documentacion...

REM Crear carpeta screenshots
if not exist "Examen-02\VetCare\docs\screenshots" mkdir "Examen-02\VetCare\docs\screenshots"

REM Copiar imagenes del pipeline CI/CD
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_0_1769933314380.png" "Examen-02\VetCare\docs\screenshots\pipeline-tests-detail.png"
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_1_1769933314380.png" "Examen-02\VetCare\docs\screenshots\maven-test-execution.png"
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_2_1769933314380.png" "Examen-02\VetCare\docs\screenshots\github-actions-workflow.png"
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_3_1769933314380.png" "Examen-02\VetCare\docs\screenshots\jacoco-coverage-report.png"
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_4_1769933314380.png" "Examen-02\VetCare\docs\screenshots\pipeline-success-summary.png"

REM Copiar diagramas de arquitectura
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_0_1769935043145.jpg" "Examen-02\VetCare\docs\screenshots\modelo-dominio-uml.jpg"
copy "C:\Users\Javier\.gemini\antigravity\brain\55fc9673-86f0-4931-86cf-60f6caf1ba4a\uploaded_media_1_1769935043145.png" "Examen-02\VetCare\docs\screenshots\arquitectura-completa.png"

REM Eliminar archivos redundantes
del "Examen-02\VetCare\docs\README.md"
del "Examen-02\VetCare\docs\ARCHITECTURE_SUMMARY.md"

echo.
echo Estructura final de docs:
dir "Examen-02\VetCare\docs" /s

echo.
echo Listo!
