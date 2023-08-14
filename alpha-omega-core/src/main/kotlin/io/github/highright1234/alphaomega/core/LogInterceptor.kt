package io.github.highright1234.alphaomega.core

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Marker
import org.apache.logging.log4j.core.Filter
import org.apache.logging.log4j.core.LifeCycle
import org.apache.logging.log4j.core.LogEvent
import org.apache.logging.log4j.core.Logger
import org.apache.logging.log4j.message.Message
import java.text.SimpleDateFormat
import java.util.*

object LogInterceptor {
    fun start() {
        (LogManager.getRootLogger() as Logger).addFilter(ConsoleFilter)
    }

    private object ConsoleFilter : Filter {
        var formatter = SimpleDateFormat("dd-MM hh:mm:ss")
        var messages = ArrayList<String>()
        override fun getOnMismatch(): Filter.Result? = null
        override fun getOnMatch(): Filter.Result? = null

        override fun filter(logger: Logger, level: Level, marker: Marker, s: String, vararg objects: Any): Filter.Result? = null

        override fun filter(logger: Logger, level: Level, marker: Marker, s: String, o: Any): Filter.Result? = null

        override fun filter(logger: Logger, level: Level, marker: Marker, s: String, o: Any, o1: Any): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any
        ): Filter.Result? = null
        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any,
            o5: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any,
            o5: Any,
            o6: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any,
            o5: Any,
            o6: Any,
            o7: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any,
            o5: Any,
            o6: Any,
            o7: Any,
            o8: Any
        ): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            s: String,
            o: Any,
            o1: Any,
            o2: Any,
            o3: Any,
            o4: Any,
            o5: Any,
            o6: Any,
            o7: Any,
            o8: Any,
            o9: Any
        ): Filter.Result? = null
        override fun filter(logger: Logger, level: Level, marker: Marker, o: Any, throwable: Throwable): Filter.Result? = null

        override fun filter(
            logger: Logger,
            level: Level,
            marker: Marker,
            message: Message,
            throwable: Throwable
        ): Filter.Result? = null

        override fun filter(logEvent: LogEvent): Filter.Result? {
            var message = logEvent.message.formattedMessage
            message = "[" + formatter.format(Date(logEvent.timeMillis)) + "] [" + logEvent.level + "] " + message
            messages.add(message)
            return null
        }

        override fun getState(): LifeCycle.State? = null

        override fun initialize() {}
        override fun start() {}
        override fun stop() {}
        override fun isStarted(): Boolean {
            return false
        }

        override fun isStopped(): Boolean {
            return false
        }
    }


}