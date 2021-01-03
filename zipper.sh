for dir in */; do
  zip -r "${dir%/}.zip" "$dir"
done
for bundle in *.zip; do
  target="$(cut -d'.' -f1 <<< $bundle)"
  mv $bundle $target
done
