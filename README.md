# evolution-message-filter

For use with "Pipe to Program" condition in Evolution's message filters.

See https://help.gnome.org/users/evolution/stable/mail-filters-conditions.html.en

## Build

You need Java 7 and Maven.

    $ mvn -Pdist package

will produce a dist package in
`target/evolution-message-filter-1.0-SNAPSHOT-dist.tar.gz`.

## Install

Just extract the dist package.

Or to install from sources:

    $ mvn install -Dprefix=/your/install/path

## Use

Use `bin/emf` from your installation location in your "Pipe to Program"
condition.

### Return Values

* `1` - Message contains a calendar invite.

