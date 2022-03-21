# GitDemo Use CMD -- push Project to Github
# Step1 : Configure <a name="Step1"/>
C:\Users\nttsa>git config --global user.name "Mei-Ling Liang" 
C:\Users\nttsa>git config --global user.email "meiling.liang58@gmail.com"
# Step2: cd ProjectFoloder and init repos
C:\Users\nttsa>cd GitStuff
C:\Users\nttsa\GitStuff>git init
Initialized empty Git repository in C:/Users/nttsa/GitStuff/.git/
# Step3: Staging Project --add 
C:\Users\nttsa\GitStuff>git add *
C:\Users\nttsa\GitStuff>git status
On branch master
No commits yet
# Step4: Staging Project --commit
C:\Users\nttsa\GitStuff>git commit -m "init commit"
[master (root-commit) 4e50ed6] init commit
 56 files changed, 2056 insertions(+)
# Step5: romote and push to GitHub 
  C:\Users\nttsa\GitStuff>git remote add origin https://github.com/meiling58/GitDemo.git
  (will need to sign in GitHub use Browse or password) 
  C:\Users\nttsa\GitStuff>git push -u origin master
  info: please complete authentication in your browser...
  Enumerating objects: 74, done.
  Counting objects: 100% (74/74), done.
  Delta compression using up to 16 threads
  Compressing objects: 100% (66/66), done.
  Writing objects: 100% (74/74), 15.85 MiB | 6.77 MiB/s, done.
  Total 74 (delta 10), reused 0 (delta 0), pack-reused 0
  remote: Resolving deltas: 100% (10/10), done.
  To https://github.com/meiling58/GitDemo.git
   * [new branch]      master -> master
  branch 'master' set up to track 'origin/master'.
