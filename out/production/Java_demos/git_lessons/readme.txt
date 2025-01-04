### git version 2.14.3 (Apple Git-98)
#    -> git --version

## Doing global configurations
#    -> git config --global user.name 'name'
#    -> git config --global user.email 'email'
#    -> git config --global init.default branch main
#    -> git config --global init.defaultBranch main

## Committing
    -> git add .
        => stages all changes in that current branch
    -> git commit -m "message"
        => commits all staged files to the repo
    -> git commit -a -m "message"
        => shortcut for staging files and committing then in one command

## Git push
#    -> git remote add origin repo-ssh/https
        => add a remote repository to associate with our local repository
#    -> git push --set-upstream origin branch-name
        => set a default remote branch, of where we are to store our data online
#    -> git push -u origin branch-name
        => shortcut for setting an upstream branch
#    -> git remote set-url origin repo-url
        => set the remote repository url to [repo-url]
#    -> git push --all
        => pushes all branch to git repo
#    -> git push --delete branch-name
        => this deletes the specified branch-name from remote repo :: should be done after
            removing a branch from local branch

## Handling branches
#    -> git branch
        => shows all of your current branches
#    -> git branch new-branch-name
        => creates a new branch but does not immediately check into the branch
#    -> git branch new-branch-name source-branch-name
        => creates a new branch with content based on the [source-branch-name]s content
#    -> git branch -d branch-name
        => this deletes the specified branch name
#    -> git checkout branch-name
        => switches from the current branch to the specified branch
#    -> git checkout -M branch-name
        => switches the main branch to the specified branch name
#    -> git checkout -b new-branch-name
        => creates a new branch and checks into the created branch
#    -> git checkout commit-hash
        => checks the specified commit state/contents
#    -> git switch -c new-branch-name
        => not working :: no longer a git command

## Git delete|remove|restore|rename|merge|stash
#    -> git merge
        => merges branch contents by combining the current branch with source branch specified
        => if conflict occur; resolve then commit and then run [git merge --continue
#    -> git restore
        => not working as expected :: no manual entry for git restore
#    -> git rebase
        => rebase the current branch with HEAD content and if a branch
            is specified; the current branch is rebase with the specified branch
            :: quite complex in details -- run git help rebase for details
#    -> git rebase --onto [base-branch] [current-base-branch] [branch-to-be-rebase]
        => switch the base branch from [current-base-branch] to [base-branch] in the
            [current-branch] -- to be researched more
#    -> git revert commit-hash
        => resets content to the commit-hash specified whilst preserving the commit
            history :: merge conflicts need be resolved
#    -> git stash
        => it stores changes made without actually committing them :: it stores
            both staged and unstaged changes
        => allows one to switch focus on tasks
#     -> git stash apply stash-name
        => this gets the saved stash and apply it to the current content :: to get
            the stash name run [git stash list] > this will list all of your stash names`1
#    -> git mv old-file-name new-file-name
        => renames a file in a repo/branch
#    -> git branch -m old-branch-name new-branch-name
        => renames git branch from old-branch-name to new-branch-name :: for just
            changing the capitalization of the name on windows, use [-M] :: with only one name
            it renames the current branch
#    -> git branch --set-upstream-to=origin/branch-name
        => another way to set an upstream branch for a current active branch
#    -> git remote update url
        => updates/changes the url of the remote repo

## Other important commands
#    -> git log
        => logs the commit history into the terminal :: useful examples being - git log --oneline |
            git log -p
#    -> git status
        => reveals the staged files and those that need staging and if all files are committed,
            nothing at all :: just confirms you have all your files committed
#    -> git diff
        => show changes made in a file of branch :: may also compare between branches, showing
            the difference in their files
#    -> git remote -v
        => shows remote urls for your repo
#    -> git remote show origin
        => shows remote urls and branches used in your repo
#    -> git help command
        => this will give details to the specified command
















