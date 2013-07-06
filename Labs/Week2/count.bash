#!/bin/bash

for f in *;do
wcOutput=$(wc -l -w "$f");
echo ""$f" "${wcOutput%%"$f"};
done
