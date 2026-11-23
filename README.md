GTA VI ANDROID MOCK-UP — BUILD GUIDE

IMPORTANT
This project creates a small fan-made Android screen called GTA VI.
It is NOT the official GTA VI game. It has no gameplay and does not provide a real game license.

WHAT IS INSIDE
- app/: Android app source code, app name, icon and screen
- .github/workflows/build.yml: online build instructions for GitHub Actions
- build.gradle and settings.gradle: Android build configuration

BUILD IT USING YOUR ANDROID PHONE

STEP 1 — CREATE A GITHUB REPOSITORY
1. Open https://github.com in your browser and sign in.
2. Tap the + button, then choose New repository.
3. Repository name: GTA-VI-Android
4. Choose Public (or Private if you prefer).
5. Tap Create repository.

STEP 2 — UPLOAD THE PROJECT FILES
1. Download and extract GTA-VI-Android-Project.zip on your phone.
2. Open the new repository on GitHub.
3. Choose Add file, then Upload files.
4. Upload ALL files and folders from inside the extracted GTA-VI-Android-Project folder.
   Do not upload only the ZIP file.
5. Make sure the .github/workflows/build.yml file is included. The .github folder may be hidden by your file manager; enable Show hidden files if needed.
6. Scroll down and tap Commit changes.

STEP 3 — START THE ONLINE BUILD
1. In the repository, open the Actions tab.
2. Select "Build GTA VI APK" from the workflow list.
3. Tap "Run workflow", choose the main branch, then tap the green Run workflow button.
4. Wait for the workflow to finish. A green check mark means it succeeded.

STEP 4 — DOWNLOAD THE APK
1. Open the completed workflow run.
2. Scroll to the Artifacts section.
3. Tap "GTA-VI-Android" to download the artifact ZIP.
4. Extract that downloaded ZIP.
5. Inside it you should find app-debug.apk.
6. Tap app-debug.apk to install. Android may ask you to allow your browser or file manager to install unknown apps.

IF YOU CANNOT SEE THE WORKFLOW
- Check that you uploaded the contents of the project folder, not the outer ZIP.
- Check that .github/workflows/build.yml exists in the repository.
- Open Actions and enable workflows if GitHub asks.

IF THE BUILD FAILS
Open the failed run and view the red error step. The build requires an internet connection and GitHub Actions enabled.

PROJECT FILES
app/src/main/AndroidManifest.xml
app/src/main/java/com/destroyer/gtavi/MainActivity.java
app/src/main/res/drawable/gtavi_icon.xml
app/build.gradle
.github/workflows/build.yml
build.gradle
settings.gradle
gradle.properties

This is a debug/test APK project. It is not signed as a Play Store release.
