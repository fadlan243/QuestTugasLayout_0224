package com.example.praktikum4

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ProfileCard(
    @StringRes name: Int,
    @StringRes address: Int,
    containerColor: Color,
    nameColor: Color,
    addressColor: Color,
    modifier: Modifier = Modifier,
    @StringRes phone: Int? = null,
    phoneColor: Color = Color.Unspecified,
    nameFontFamily: FontFamily? = null,
    nameFontStyle: FontStyle? = null,
    nameFontWeight: FontWeight = FontWeight.Bold
) {
 {
                Text(
                    text = stringResource(name),
                    color = nameColor,
                    fontSize = spResource(R.dimen.name_size),
                    fontWeight = nameFontWeight,
                    fontFamily = nameFontFamily,
                    fontStyle = nameFontStyle
                )

        }
    }
}