package com.github.radish001.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.radish001.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
