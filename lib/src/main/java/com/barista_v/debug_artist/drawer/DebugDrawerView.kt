package com.barista_v.debug_artist.drawer

import com.barista_v.debug_artist.item.InputMenuItem
import com.barista_v.debug_artist.item.SpinnerMenuItem

interface DebugDrawerView {
  fun addDividerItem()
  fun addStethoSwitch(checked: Boolean)
  fun addLeakCanarySwitch(checked: Boolean)
  fun addPicassoLogsSwitch(checked: Boolean)
  fun addScalpelSwitch(checked: Boolean)
  fun addLynksButton()
  fun addPhoenixButton()

  fun addInputItem(item: InputMenuItem)
  fun addSpinnerItem(it: SpinnerMenuItem)
  fun addLabelItem(id: String, text: String)
}