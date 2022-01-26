package seam

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    println("Enter rectangle width:")
    val width: Int = readLine()!!.toInt()
    println("Enter rectangle height:")
    val height: Int = readLine()!!.toInt()
    println("Enter output image name:")
    val filename: String = readLine()!!.toString()


    val imageFile = File(filename)
    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val lines = image.createGraphics()
    lines.color = Color.RED
    lines.drawLine(0, 0, width -1 , height -1)
    lines.drawLine(0, height -1, width -1, 0)

    saveImage(image, imageFile)
}


fun saveImage(image: BufferedImage, imageFile: File) {
    ImageIO.write(image, "png", imageFile)
}