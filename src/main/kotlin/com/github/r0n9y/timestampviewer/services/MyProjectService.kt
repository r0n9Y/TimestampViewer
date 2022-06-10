package com.github.r0n9y.timestampviewer.services

import com.intellij.openapi.project.Project
import com.github.r0n9y.timestampviewer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
