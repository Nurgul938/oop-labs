package component

import data.Lesson
import kotlinx.html.InputType
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import react.*
import react.dom.h3
import react.dom.input
import react.dom.li
import react.dom.span

interface namelessonProps : RProps {
    var lesson: Lesson
}

val fnameLesson =
    functionalComponent<namelessonProps> { props ->
        li{
            +props.lesson.name
        }
    }

fun RBuilder.namelesson(
    lesson: Lesson
) = child(fnameLesson) {
    attrs.lesson = lesson
}