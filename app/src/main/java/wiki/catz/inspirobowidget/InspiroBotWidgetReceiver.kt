package wiki.catz.inspirobowidget

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class InspiroBotWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = InspiroBotWidget()
}

/*
1,000 = 1 sec
60,000 = 60 sec | 1 min
180,000 = 3min
1,800,000 = 30min
 */