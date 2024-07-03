#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "card"
DESCRIPTION = "A game built in Flutter."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "2dac56ef2852b8f14030f7a99b6abd239e61adab"
SRC_URI = "git://github.com/flutter/games.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "card"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-games-templates-card"
FLUTTER_APPLICATION_PATH = "templates/card"

inherit flutter-app
