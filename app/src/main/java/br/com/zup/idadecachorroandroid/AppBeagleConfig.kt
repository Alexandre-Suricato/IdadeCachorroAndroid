package br.com.zup.idadecachorroandroid

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

@BeagleComponent
class AppBeagleConfig : BeagleConfig {
    override val isLoggingEnabled: Boolean = true
    override val baseUrl: String get() = "https://10.0.2.2:8080/"
    override val environment: Environment get() = Environment.DEBUG
    override val cache: Cache = Cache(
        enabled = true, // Habilita ou desabilita o cache em memória e disco.
        maxAge = 300, // Tempo em segundos que o cache em memória estará ativo.
        memoryMaximumCapacity = 15 // Tamanho do cache de memória LRU. Representa o número de telas que vão estar na memória.
    )
}