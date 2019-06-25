package contracts.creditcardservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/credit-scores'
        body (
            "citizenNumber" : 6478,
            "requestDate": anyDate()
        )
        headers {
            contentType applicationJson()
        }
    }
    response {
        status 200
        body """
            {
                "score" : "LOW",
                "uuid": "66ce29f3-ae87-4097-94e8-60b3b10c3855"
            }
            """
        headers {
            contentType applicationJson()
        }
    }
}
