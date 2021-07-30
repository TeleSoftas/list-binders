## TODO

- Force ItemBinder method implementations, perhaps implement ItemBinder in BinderViewHolder

- More flexibility with overriding ItemCallback

- Documentation improvements

- Check what should be internal

- Proper placement in Telesoftas domain

- Proper publishing.

- Decide when to call `viewHolder` when `holder`

- Provide overridable DefaultItemCallback for each item

- Not force extending ListItem for SingleViewTypeAdapter

- Validate that all types of enums were provided.

- Consider all the validation options.
    Consider ways that a user could fail the setup appropriately

- Passing viewHolder to itself looks weird (such as `viewHolder.onCreate(viewHolder)`).

- Fix documentation to actually create javadocs (right now it's empty)

- Decide if convertion to Kotlin is necessary, at least for sample.

- Sublist item?

- What if you were using stableID for viewType? Would that be possible somehow?

## Internal instructions for building

gradlew bintrayUpload
gradlew bintrayPublish