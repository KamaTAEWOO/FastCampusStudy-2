package fastcampus.part2.chapter2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class WaveformView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val ampList = mutableListOf<Float>() //원시 데이터
    private val rectList = mutableListOf<RectF>()

    private val rectWidth = 15f
    private var tick = 0

    // color 지정
    private val redPaint = Paint().apply {
        color = Color.RED
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        for (rectF in rectList) {
            canvas?.drawRect(rectF, redPaint)
        }
    }

    fun addAmplitude(maxAmplitude: Float) {
        ampList.add(maxAmplitude)
        rectList.clear()

        val maxRect = (this.width / rectWidth).toInt()

        val amps = ampList.takeLast(maxRect) //맨뒤에서 몇개를 가지고 올 것 인가?

        for ((i, amp) in amps.withIndex()) {
            val rectF = RectF()
            rectF.top = (this.height / 2) - amp / 2 + 5
            rectF.bottom = rectF.top + amp + 5
            rectF.left = i * rectWidth
            rectF.right = rectF.left + (rectWidth - 5f)

            rectList.add(rectF)
        }

        invalidate()
    }

    fun replayAmplitude() {
        rectList.clear()

        val maxRect = (this.width / rectWidth).toInt()
        val amps = ampList.take(tick).takeLast(maxRect)

        for ((i, amp) in amps.withIndex()) {
            val rectF = RectF()
            rectF.top = (this.height / 2) - amp / 2 + 5
            rectF.bottom = rectF.top + amp + 5
            rectF.left = i * rectWidth
            rectF.right = rectF.left + (rectWidth - 5f)

            rectList.add(rectF)
        }

        tick++

        invalidate()
    }

    fun clearData() {
        ampList.clear()
    }

    fun clearWave() {
        rectList.clear()
        tick = 0
        invalidate()
    }
}