apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.coreNavigation))
    "implementation"(project(Modules.userDomain))
}
