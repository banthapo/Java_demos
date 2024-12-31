### git version 2.14.3 (Apple Git-98)

## Doing global configurations
    -> git config --global user.name 'name'
    -> git config --global user.email 'email'
    -> git config --global init.default branch main
    -> git config --global init.defaultBranch main

## Committing
    -> git commit -a -m "message"
        => shortcut for staging files and committing then in one command

## Handling branches
    -> git branch
        => shows all of your current branches
    -> git branch new-branch-name
        => creates a new branch but does not immediately check into the branch
    -> git branch -d branch-name
        => this deletes the specified branch name
    -> git checkout branch-name
        => switches from the current branch to the specified branch
    -> git checkout -b new-branch-name
        => creates a new branch and checks into the created branch
    -> git switch -c new-branch-name
        => not working :: no longer a git command

## Git delete|remove|restore|rename
    -> git restore
        => not working as expected :: no manual entry for git restore
    -> git rebase
        => rebase the current branch with HEAD content and if a branch
            is specified; the current branch is rebase with the specified branch
            :: quite complex in details -- run git help rebase for details
    -> git revert commit-hash
        => resets content to the commit-hash specified whilst preserving the commit
            history :: merge conflicts need be resolved
    -> git mv old-file-name new-file-name
        => renames a file in a repo/branch
    -> git branch -m old-branch-name new-branch-name
        => renames git branch from old-branch-name to new-branch-name :: for just
            changing the capitalization of the name on windows, use [-M]

## Other important commands
    -> git log
        => logs the commit history into the terminal :: useful examples being - git log --oneline
            git log -p
    -> git status
        => reveals the staged files and those that need staging and if all files are committed,
            nothing at all :: just confirms you have all your files committed
    -> git diff
        => show changes made in a file of branch :: may also compare between branches, showing
            the difference in their files

















