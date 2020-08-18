package br.com.zup.idadecachorroandroid

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

@BeagleComponent
class AppDesignSystem: DesignSystem()  {

    override fun image(id: String): Int? =
        when (id){
            "cachorro" -> R.drawable.cachorro
            else -> super.image(id)
        }
}