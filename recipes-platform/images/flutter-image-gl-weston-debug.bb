SUMMARY = "Baseline Flutter Weston Image for Development"

LICENSE = "MIT"

require flutter-image-gl-weston.inc

CORE_IMAGE_BASE_INSTALL:append = " \
    ivi-homescreen-debug \
    flutter-gallery-debug \
    "