package com.alexis.preproyecto.ui.screens.component

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexis.preproyecto.data.bookListItem
import com.alexis.preproyecto.data.nivelRiesgo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dropMenuSeach(){
    val context = LocalContext.current
    var expanded by remember { mutableStateOf(false) }
    var selectedRiesgo by remember { mutableStateOf(nivelRiesgo[0]) }


Box(
    modifier = Modifier.height(40.dp).width(100.dp)
) {
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = {
            expanded = !expanded
        }
    ) {
        TextField(
            value = selectedRiesgo,
            onValueChange = {},
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth()




        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {

            bookListItem.forEach { item ->
                item.genero.forEach{itemg ->
                    DropdownMenuItem(

                        text = { Text(text = itemg) },
                        onClick = {
                            selectedRiesgo = itemg
                            expanded = false
                            Toast.makeText(context, itemg, Toast.LENGTH_SHORT).show()
                        }
                    )
                }

            }
        }
    }
}
}


@Preview(showBackground = true)
@Composable
fun previewdrop(){
    dropMenuSeach()
}