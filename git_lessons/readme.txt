### git version 2.14.3 (Apple Git-98)

## Using the command for add and committing in the same command
    -> git commit -a -m "message"
        => not giving desired results.

## Doing global configurations
    -> git config --global user.name 'name'
    -> git config --global user.email 'email'
    -> git config --global init.default branch main
    -> git config --global init.defaultBranch main

## Creating a new ¯¯
    -> git branch new-branch-name
        => creates a new branch but does not immediately check into the branch
    -> git checkout -b new-branch-name
        => creates a new branch and checks into the created branch
    -> git switch -c new-branch-name
        => not working :: no longer a git command

## Git delete/removing and restore
    -> git restore
        => not working as expected :: no manual entry for git restore
    -> git rebase
        => rebase the current branch with HEAD content and if a branch
            is specified; the current branch is rebase with the specified branch
            :: quite complex in details -- run git help rebase for details


