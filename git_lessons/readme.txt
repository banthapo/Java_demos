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
    -> git revert commit-hash
        => resets content to the commit-hash specified whilst preserving the commit
            history :: merge conflicts need be resolved

