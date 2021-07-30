## TODO

- Documentation improvements
    - Fix documentation to actually create javadocs (right now it's empty)

- Proper placement in Telesoftas domain

- Proper publishing.

- Not force extending ListItem for SingleViewTypeAdapter

- Consider all the validation options.
    Consider ways that a user could fail the setup appropriately

- Passing viewHolder to itself looks weird (such as `viewHolder.onCreate(viewHolder)`).

- Decide if convertion to Kotlin is necessary, at least for sample.

## Internal instructions for building

gradlew bintrayUpload
gradlew bintrayPublish