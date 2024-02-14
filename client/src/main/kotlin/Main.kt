package space.insyri

fun main() {
    val x = arrayOf(
        "java.version",
        "java.version.date",
        "java.vendor",
        "java.vendor.version",
        "java.vendor.url",
        "java.vendor.url.bug",
        "java.specification.name",
        "java.specification.vendor",
        "java.specification.version",
        "java.vm.name",
        "java.vm.vendor",
        "java.vm.version",
        "java.vm.info",
        "java.vm.specification.name",
        "java.vm.specification.vendor",
        "java.vm.specification.version",
        "java.runtime.name",
        "java.runtime.version",
        "java.class.version"
    )

    for (s in x) {
        println(s + ": " + System.getProperty(s))
    }
}