#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "flutter_maps_firestore"
DESCRIPTION = "A new Flutter project."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "05f33bf461297702f098c8327461521b4270fa16"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_maps_firestore"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-flutter-maps-firestore"
FLUTTER_APPLICATION_PATH = "flutter_maps_firestore"

inherit flutter-app