package aprl.compiler

import java.io.File

class AprlCmdParser(args: Array<String>) {
    
    var targetDir: String? = null
    var sourceFiles: ArrayList<File> = arrayListOf()
    
    init {
        var inTargetDir = false
        for (arg in args) {
            if (inTargetDir) {
                targetDir = arg
                inTargetDir = false
                continue
            }
            when (arg) {
                "-d" -> inTargetDir = true
                else -> {
                    val file = File(arg)
                    if (!file.exists()) {
                        throw Exception("File $arg does not exist!")
                    }
                    if (!file.path.endsWith(".aprl")) {
                        throw Exception("$arg is not an APRL file!")
                    }
                    sourceFiles.add(file)
                }
            }
        }
    }
    
}