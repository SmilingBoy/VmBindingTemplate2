package com.github.smilingboy.vmbindingtemplate2.services

import com.intellij.openapi.project.Project
import com.github.smilingboy.vmbindingtemplate2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
