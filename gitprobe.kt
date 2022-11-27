git config --global user.name "Lajos Paulo"
git config --global user.email "paulolajos@mail.com"

git remote add origin https://github.com/PauloLajos/kotlin_apprentice.git
git branch -M "main"
git push -u origin "main"

git add .
git commit -m "My commit message"
git push origin main
//git push -u origin HEAD
