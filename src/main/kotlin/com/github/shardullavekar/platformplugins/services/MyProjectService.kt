package com.github.shardullavekar.platformplugins.services

import com.intellij.openapi.project.Project
import com.github.shardullavekar.platformplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
