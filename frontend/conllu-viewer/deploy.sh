#!/bin/bash

DEPLOY_TARGET=${1:-"frontend/conllu-viewer/dist"}

if [ -z "$1" ]; then
  echo "No folder specified. Using default: $DEPLOY_TARGET"
fi

cd ../../ && git subtree push --prefix $DEPLOY_TARGET origin gh-pages
