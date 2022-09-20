
rootProject.name = "DesignPatternPractice"
include("abstract-factory-pattern")
include("abstract-factory-pattern:common")
findProject(":abstract-factory-pattern:common")?.name = "common"
include("abstract-factory-pattern:ui-android")
findProject(":abstract-factory-pattern:ui-android")?.name = "ui-android"
include("abstract-factory-pattern:ui-web")
findProject(":abstract-factory-pattern:ui-web")?.name = "ui-web"
include("abstract-factory-pattern:ui-ios")
findProject(":abstract-factory-pattern:ui-ios")?.name = "ui-ios"
include("builder")
include("adapter")
