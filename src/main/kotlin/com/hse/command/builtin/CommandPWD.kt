package com.hse.command.builtin

import com.hse.CommandContext
import com.hse.command.SimpleCommand

class CommandPWD : SimpleCommand("pwd") {
    override fun execute(arguments: List<String>, ctx: CommandContext) {
        ctx.writer.println(ctx.shell.workingDirectoryAbsolutePath.toString())
    }
}